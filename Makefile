# 변수 정의
DOCKER_COMPOSE=docker-compose
APP_NAME=my-spring-app
JAR_FILE=build/libs/$(APP_NAME).jar

# 기본 명령어
.PHONY: help build run db-up db-down db-logs clean

help:
	@echo "사용 가능한 명령어:"
	@echo "  make build       - Spring Boot 프로젝트 빌드"
	@echo "  make run         - 빌드한 JAR 파일 실행"
	@echo "  make db-up       - Docker로 DB 컨테이너 실행"
	@echo "  make db-down     - DB 컨테이너 중지 및 삭제"
	@echo "  make db-logs     - DB 로그 보기"
	@echo "  make clean       - 빌드된 파일 및 도커 정리"

build:
	./gradlew clean build

run:
	java -jar $(JAR_FILE)

db-up:
	$(DOCKER_COMPOSE) up -d db

db-down:
	$(DOCKER_COMPOSE) down

db-logs:
	$(DOCKER_COMPOSE) logs -f db

clean:
	./gradlew clean
	$(DOCKER_COMPOSE) down -v


