#!/bin/sh

if [ -n "$SERVERS" ]; then

cat > /data/application-docker.yml << EOF
eureka:
  client:
    serviceUrl:
      defaultZone: $SERVERS
EOF

fi
exec "$@"