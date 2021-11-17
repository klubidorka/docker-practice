FROM python:3.8-alpine

WORKDIR /fill_database

ADD ./requirements.txt ./

RUN pip install -r requirements.txt

ADD . .
