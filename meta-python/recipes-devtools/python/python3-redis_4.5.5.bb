SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
HOMEPAGE = "http://github.com/andymccurdy/redis-py"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1db1f331d351900707368237cc4880cf"

SRC_URI[sha256sum] = "dc87a0bdef6c8bfe1ef1e1c40be7034390c2ae02d92dcd0c7ca1729443899880"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-asyncio \
    python3-compression \
    python3-cryptography \
    python3-datetime \
    python3-json \
    python3-packaging \
"
