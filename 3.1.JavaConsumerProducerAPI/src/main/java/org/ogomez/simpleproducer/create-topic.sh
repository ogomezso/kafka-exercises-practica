kafka-topics --bootstrap-server kafka1:19092 --create --topic simple-producer-topic --partitions 3 --replication-factor 3 --config max.message.bytes=64000 --config flush.messages=1