#!/bin/bash
while true; do
  STATUS=$(gradle --status | grep "Idle")
  if [ -n "$STATUS" ]; then
    break
  fi
  sleep 1
done
