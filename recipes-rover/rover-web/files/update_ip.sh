#!/bin/bash

TEST_NET=`ip addr show dev eth0 | grep inet | grep -v "127.0.0"`

while [ -z "${TEST_NET}" ]; do
  echo "Waiting for network..."
  sleep 1
  TEST_NET=`ip addr show dev eth0 | grep inet | grep -v "127.0.0"`
done

MY_IP=`hostname -i`

echo "Updating IP in $1 to ${MY_IP}"
sed -i -e 's/\(http:\/\/\)[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}/\1'${MY_IP}'/g' $1

