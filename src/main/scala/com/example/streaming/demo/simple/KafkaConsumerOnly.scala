package com.example.streaming.demo.simple

import java.util
import java.util.UUID

import com.example.streaming.demo.data.{AvroDataBuilder, KafkaDataBuilder}
import org.apache.avro.Schema
import org.apache.avro.generic.GenericRecord
import org.apache.avro.io.{DatumReader, Decoder, DecoderFactory}
import org.apache.avro.specific.SpecificDatumReader
import org.apache.kafka.clients.consumer.KafkaConsumer

/**
  * Created by yilong on 2019/3/17.
  */

object KafkaConsumerOnly extends App {
  def getRecord(schema: Schema, message: Array[Byte]) : GenericRecord = {
    // Deserialize and create generic record
    val reader: DatumReader[GenericRecord] = new SpecificDatumReader[GenericRecord](schema)
    val decoder: Decoder = DecoderFactory.get().binaryDecoder(message, null)
    val userData: GenericRecord = reader.read(null, decoder)

    userData
  }

  def comsumerRecord(schemaStr : String, consumer : KafkaConsumer[String,Array[Byte]], topic : String) : Unit = {
    val parser = new Schema.Parser();
    val schema = parser.parse(schemaStr);

    val minBatchSize = 10
    while (true) {
      val records = consumer.poll(100)
      var i = 0
      import scala.collection.JavaConversions._
      for (record <- records) {
        printf("offset = %d, key = %s, \n", record.offset, record.key)
        val rd = getRecord(schema, record.value())
        println(rd)
        i += 1
      }

      println("********************** : " + i)
      if (i >= minBatchSize) consumer.commitSync //批量完成写入后，手工sync offset
    }
  }

  val topic = "myrecord1"
  val brokers = "localhost:9092"
  val groupId = UUID.randomUUID().toString
  val clientid = ""

  val props = KafkaDataBuilder.getKafkaProp(groupId, clientid)

  import org.apache.kafka.clients.consumer.KafkaConsumer

  val consumer = new KafkaConsumer[String,Array[Byte]](props)
  consumer.subscribe(util.Arrays.asList(topic))

  comsumerRecord(AvroDataBuilder.getComposedSchemaStr(), consumer, topic)
}
