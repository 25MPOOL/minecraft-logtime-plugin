# JAVAプログラムを動かす最小限の環境。
FROM eclipse-temurin:17-jre-jammy

# 必要なツールをインストール
RUN apt-get update && apt-get install -y wget && rm -rf /var/lib/apt/lists/*

# サーバーの作業ディレクトリを作成
WORKDIR /server

# マイクラのバージョン
ARG MC_VERSION=1.21.0
# paperサーバーのjarファイルをダウンロード
RUN wget -0 paper.jar https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION}/builds/$(wget -qO- https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION} | grep -o '"builds":\[[^]]*' | grep -o '[0-9]*' | tail -1)/downloads/paper-${MC_VERSION}-$(wget -qO- https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION} | grep -o '"builds":\[[^]]*' | grep -o '[0-9]*' | tail -1).jar

# サーバーを起動するコマンド
CMD [ "java", "-Xms1G", "-Xmx1G", "-jar", "paper.jar", "--nogui" ]
