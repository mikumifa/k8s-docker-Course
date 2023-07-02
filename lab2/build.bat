REM 构建 Admin-service 镜像并部署到 Kubernetes
cd Admin-Service
docker build -t admin-service:latest -f Dockerfile .
kubectl apply -f admin-deployment.yaml
kubectl apply -f admin-service.yaml
cd ..

REM 构建 Eurkea-Server 镜像并部署到 Kubernetes
cd Eurkea-Service
docker build -t eureka-service:latest -f Dockerfile .
kubectl apply -f eureka-deployment.yaml
kubectl apply -f eureka-service.yaml
cd ..

REM 构建 User-Service 镜像并部署到 Kubernetes
cd User-Service
docker build -t user-service:latest -f Dockerfile .
kubectl apply -f user-deployment.yaml
kubectl apply -f user-service.yaml
cd ..

pause