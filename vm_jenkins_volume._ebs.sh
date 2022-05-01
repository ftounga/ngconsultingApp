#!/usr/bin/env bash

sudo mkfs -t ext4 /dev/xvdf
sudo mkdir /jenkins-volume
sudo mount /dev/xvdf /jenkins-volume/
