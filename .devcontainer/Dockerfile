FROM eclipse-temurin:21-ubi9-minimal
RUN microdnf update -y && \
    microdnf install -y \
    maven \
    git \
    libXext \
    libXrender \
    libXtst \
    libXi \
    libXrandr && \
    microdnf clean all
