# kafka create topic 
cd /opt/kafka/bin
./kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test
# kafka list topic 
 ./kafka-topics.sh --list --zookeeper zookeeper:2181