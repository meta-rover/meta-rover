#!/bin/bash

TEST_NET=0

while [[ ${TEST_NET} == 0 ]]; do
  echo "Waiting for network..."
  sleep 1
  TEST_NET=`ping -c1 8.8.8.8 | grep ttl | wc -l`
done

MY_IP=`hostname -i`

echo "Updating IP in $1 to ${MY_IP}"
sed -i -e 's/\(http:\/\/\)[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}/\1'${MY_IP}'/g' $1

