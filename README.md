# legacy-database-mapping

## setup docker mysql
```shell
docker run --rm \
--name=wp-db \
-e MYSQL_DATABASE=wp \
-e MYSQL_USER=pmtai \
-e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e MYSQL_ROOT_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e TZ=Asia/Jakarta \
-p 6603:3306 \
-v "$PWD/docker/wp-db/conf.d":/etc/mysql/conf.d \
-v "$PWD/storage/docker/wpdb-data":/var/lib/mysql \
mysql:8
```