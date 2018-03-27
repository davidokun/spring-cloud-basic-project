# bin/bash
echo ---------------------------- &&
echo -- Building Config-Server -- &&
echo ---------------------------- &&
cd config-server/docker && docker build -t config-server . &&
echo ---------------------------- &&
echo -- Building Game-Service  -- &&
echo ---------------------------- &&
cd ../../game-service/docker && docker build -t game-service . &&
echo ----------------------------- &&
echo -- Building Gateway-Server -- &&
echo ----------------------------- &&
cd ../../gateway-service/docker && docker build -t gateway-server . &&
echo -------------------------------- &&
echo -- Building Publisher-Service -- &&
echo -------------------------------- &&
cd ../../publisher-service/docker && docker build -t publisher-service . &&
echo ------------------------------ &&
echo -- Building Registry-Server -- &&
echo ------------------------------ &&
cd ../../registry-server/docker && docker build -t registry-server . &&
echo -------------- &&
echo -- Finished -- &&
echo --------------
