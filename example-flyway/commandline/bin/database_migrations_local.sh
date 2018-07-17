#!/bin/bash

cd $(dirname $0)

../app/flyway \
    -url=jdbc:mysql://localhost/bbs \
    -user=root \
    -password= \
    -locations=filesystem:./databases/bbs \
    migrate

