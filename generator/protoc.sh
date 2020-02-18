#!/usr/bin/env bash
BASE_DIR=./src/main/proto
OUT_DIR=./target/generated-sources/protobuf/go/

find ${BASE_DIR} -name *.proto -type f -exec protoc -I ${BASE_DIR} --include_imports {} --go_out=plugins=grpc:${OUT_DIR} --descriptor_set_out=${BASE_DIR}/it/id/input/ds.pb \;