
echo "introduce el fichero json de configuracion:"

read fileName

curl -d @"${fileName}" -H "Content-Type: application/json" -X POST http://localhost:8083/connectors