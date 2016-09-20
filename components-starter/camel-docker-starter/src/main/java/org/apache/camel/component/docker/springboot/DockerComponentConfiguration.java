/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.docker.springboot;

import java.util.Map;
import org.apache.camel.component.docker.DockerOperation;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The docker component is used for managing Docker containers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.docker")
public class DockerComponentConfiguration {

    /**
     * To use the shared docker configuration
     */
    private DockerConfigurationNestedConfiguration configuration;

    public DockerConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            DockerConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class DockerConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.docker.DockerConfiguration.class;
        /**
         * Docker host
         */
        private String host = "localhost";
        /**
         * Docker port
         */
        private Integer port;
        /**
         * User name to authenticate with
         */
        private String username;
        /**
         * Password to authenticate with
         */
        private String password;
        /**
         * Email address associated with the user
         */
        private String email;
        /**
         * Server address for docker registry.
         */
        private String serverAddress = "https://index.docker.io/v1/";
        /**
         * Request timeout for response (in seconds)
         */
        private Integer requestTimeout;
        /**
         * Use HTTPS communication
         */
        private Boolean secure;
        /**
         * Location containing the SSL certificate chain
         */
        private String certPath;
        /**
         * Maximum total connections
         */
        private Integer maxTotalConnections;
        /**
         * Maximum route connections
         */
        private Integer maxPerRouteConnections;
        /**
         * Whether to use logging filter
         */
        private Boolean loggingFilter;
        /**
         * Whether to follow redirect filter
         */
        private Boolean followRedirectFilter;
        /**
         * Additional configuration parameters as key/value pairs
         */
        private Map parameters;
        /**
         * Which operation to use
         */
        private DockerOperation operation;
        /**
         * Check TLS
         */
        private Boolean tlsVerify;
        /**
         * Socket connection mode
         */
        private Boolean socket;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getServerAddress() {
            return serverAddress;
        }

        public void setServerAddress(String serverAddress) {
            this.serverAddress = serverAddress;
        }

        public Integer getRequestTimeout() {
            return requestTimeout;
        }

        public void setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
        }

        public Boolean getSecure() {
            return secure;
        }

        public void setSecure(Boolean secure) {
            this.secure = secure;
        }

        public String getCertPath() {
            return certPath;
        }

        public void setCertPath(String certPath) {
            this.certPath = certPath;
        }

        public Integer getMaxTotalConnections() {
            return maxTotalConnections;
        }

        public void setMaxTotalConnections(Integer maxTotalConnections) {
            this.maxTotalConnections = maxTotalConnections;
        }

        public Integer getMaxPerRouteConnections() {
            return maxPerRouteConnections;
        }

        public void setMaxPerRouteConnections(Integer maxPerRouteConnections) {
            this.maxPerRouteConnections = maxPerRouteConnections;
        }

        public Boolean getLoggingFilter() {
            return loggingFilter;
        }

        public void setLoggingFilter(Boolean loggingFilter) {
            this.loggingFilter = loggingFilter;
        }

        public Boolean getFollowRedirectFilter() {
            return followRedirectFilter;
        }

        public void setFollowRedirectFilter(Boolean followRedirectFilter) {
            this.followRedirectFilter = followRedirectFilter;
        }

        public Map getParameters() {
            return parameters;
        }

        public void setParameters(Map parameters) {
            this.parameters = parameters;
        }

        public DockerOperation getOperation() {
            return operation;
        }

        public void setOperation(DockerOperation operation) {
            this.operation = operation;
        }

        public Boolean getTlsVerify() {
            return tlsVerify;
        }

        public void setTlsVerify(Boolean tlsVerify) {
            this.tlsVerify = tlsVerify;
        }

        public Boolean getSocket() {
            return socket;
        }

        public void setSocket(Boolean socket) {
            this.socket = socket;
        }
    }
}