FROM node:12.2.0 as builder
WORKDIR /usr/src/app
ENV PATH /usr/src/app/node_modules/.bin:$PATH
COPY package*.json /usr/src/app/
RUN npm install -g @angular/cli@7.3.9 && \
	npm update && \
	npm install
COPY . /usr/src/app
RUN ng build --aot --build-optimizer --prod

FROM nginx:1.17.1-alpine
COPY ./nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /usr/src/app/dist/ngconsulting-app /usr/share/nginx/html
