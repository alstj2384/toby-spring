# MariaDB 이미지를 기반으로 컨테이너 생성
FROM mariadb:latest

# 환경 변수를 설정하여 MariaDB 초기 사용자와 비밀번호 생성
ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE=toby
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=1234

# MariaDB 데이터 디렉토리를 마운트 가능
VOLUME /var/lib/mysql

# MariaDB 포트를 외부로 노출
EXPOSE 3306
