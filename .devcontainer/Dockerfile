FROM mcr.microsoft.com/devcontainers/java:21

USER root
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends maven
USER vscode