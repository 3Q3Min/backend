# 기본 명령어
.PHONY: help docker-compose-up-local docker-compose-down-local run-local clean-local

help:
	@echo "사용 가능한 명령어:"
	@echo "  make docker-compose-up-local       - 로컬 DB 컨테이너 생성 및 초기화"
	@echo "  make docker-compose-down-local         - 로컬 DB 컨테이너 종료 및 제거"
	@echo "  make run-local       - Docker로 DB 컨테이너 실행"
	@echo "  make clean-local       - 빌드된 파일 정리"

docker-compose-up-local:
	docker-compose --env-file envfile/local.env -f infra/docker-compose.local.yml up -d

docker-compose-down-local:
	docker-compose --env-file envfile/local.env -f infra/docker-compose.local.yml down -v

run-local:
	./gradlew bootRun

clean-local:
	./gradlew clean
