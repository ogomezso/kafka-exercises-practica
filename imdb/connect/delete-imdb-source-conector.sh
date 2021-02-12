
echo "introduce el nombre del connector:"

read connectorName

curl -H "Content-Type: application/json" -X DELETE http://localhost:8083/connectors/${connectorName}