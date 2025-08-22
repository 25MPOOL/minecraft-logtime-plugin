# -----------------------------------------------------------------
# docker/paper/Dockerfile
# -----------------------------------------------------------------
# プラグインをテストするためのPaperサーバー環境を定義します。(1.21.0対応版)
# -----------------------------------------------------------------

# Minecraft 1.21 は Java 21 が必須のため、ベースイメージを更新
FROM eclipse-temurin:21-jre-jammy

# 必要なツールをインストール
RUN apt-get update && apt-get install -y wget && rm -rf /var/lib/apt/lists/*

# サーバーの作業ディレクトリを作成
WORKDIR /server

# Paperサーバーの最新ビルドを自動で取得するように修正
ARG MC_VERSION=1.21
RUN wget -O paper.jar https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION}/builds/$(wget -qO- https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION} | grep -o '"builds":\[[^]]*' | grep -o '[0-9]*' | tail -1)/downloads/paper-${MC_VERSION}-$(wget -qO- https://api.papermc.io/v2/projects/paper/versions/${MC_VERSION} | grep -o '"builds":\[[^]]*' | grep -o '[0-9]*' | tail -1).jar

# サーバーを起動するコマンド
# メモリ割り当てはPCのスペックに合わせて調整してください (例: -Xms2G -Xmx2G)
CMD ["java", "-Xms1G", "-Xmx1G", "-jar", "paper.jar", "--nogui"]
