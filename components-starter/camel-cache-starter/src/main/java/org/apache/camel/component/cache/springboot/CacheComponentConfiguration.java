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
package org.apache.camel.component.cache.springboot;

import net.sf.ehcache.store.MemoryStoreEvictionPolicy;
import org.apache.camel.component.cache.CacheEventListenerRegistry;
import org.apache.camel.component.cache.CacheLoaderRegistry;
import org.apache.camel.component.cache.CacheManagerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The cache component enables you to perform caching operations using EHCache
 * as the Cache Implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.cache")
public class CacheComponentConfiguration {

    /**
     * To use the given CacheManagerFactory for creating the CacheManager. By
     * default the DefaultCacheManagerFactory is used.
     */
    @NestedConfigurationProperty
    private CacheManagerFactory cacheManagerFactory;
    /**
     * Sets the Cache configuration
     */
    private CacheConfigurationNestedConfiguration configuration;
    /**
     * Sets the location of the ehcache.xml file to load from classpath or file
     * system. By default the file is loaded from classpath:ehcache.xml
     */
    private String configurationFile;

    public CacheManagerFactory getCacheManagerFactory() {
        return cacheManagerFactory;
    }

    public void setCacheManagerFactory(CacheManagerFactory cacheManagerFactory) {
        this.cacheManagerFactory = cacheManagerFactory;
    }

    public CacheConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            CacheConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getConfigurationFile() {
        return configurationFile;
    }

    public void setConfigurationFile(String configurationFile) {
        this.configurationFile = configurationFile;
    }

    public static class CacheConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.cache.CacheConfiguration.class;
        /**
         * Name of the cache
         */
        private String cacheName;
        /**
         * The number of elements that may be stored in the defined cache in
         * memory.
         */
        private Integer maxElementsInMemory;
        /**
         * Which eviction strategy to use when maximum number of elements in
         * memory is reached. The strategy defines which elements to be removed.
         * <ul>
         * <li>LRU - Lest Recently Used</li>
         * <li>LFU - Lest Frequently Used</li>
         * <li>FIFO - First In First Out</li>
         * </ul>
         */
        @NestedConfigurationProperty
        private MemoryStoreEvictionPolicy memoryStoreEvictionPolicy;
        /**
         * Specifies whether cache may overflow to disk
         */
        private Boolean overflowToDisk;
        /**
         * This parameter is ignored. CacheManager sets it using setter
         * injection.
         */
        @Deprecated
        private String diskStorePath;
        /**
         * Sets whether elements are eternal. If eternal, timeouts are ignored
         * and the element never expires.
         */
        private Boolean eternal;
        /**
         * The maximum time between creation time and when an element expires.
         * Is used only if the element is not eternal
         */
        private Long timeToLiveSeconds;
        /**
         * The maximum amount of time between accesses before an element expires
         */
        private Long timeToIdleSeconds;
        /**
         * Whether the disk store persists between restarts of the application.
         */
        private Boolean diskPersistent;
        /**
         * The number of seconds between runs of the disk expiry thread.
         */
        private Long diskExpiryThreadIntervalSeconds;
        /**
         * To configure event listeners using the CacheEventListenerRegistry
         */
        @NestedConfigurationProperty
        private CacheEventListenerRegistry eventListenerRegistry;
        /**
         * To configure cache loader using the CacheLoaderRegistry
         */
        @NestedConfigurationProperty
        private CacheLoaderRegistry cacheLoaderRegistry;
        /**
         * Whether to turn on allowing to store non serializable objects in the
         * cache. If this option is enabled then overflow to disk cannot be
         * enabled as well.
         */
        private Boolean objectCache;

        public String getCacheName() {
            return cacheName;
        }

        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        public Integer getMaxElementsInMemory() {
            return maxElementsInMemory;
        }

        public void setMaxElementsInMemory(Integer maxElementsInMemory) {
            this.maxElementsInMemory = maxElementsInMemory;
        }

        public MemoryStoreEvictionPolicy getMemoryStoreEvictionPolicy() {
            return memoryStoreEvictionPolicy;
        }

        public void setMemoryStoreEvictionPolicy(
                MemoryStoreEvictionPolicy memoryStoreEvictionPolicy) {
            this.memoryStoreEvictionPolicy = memoryStoreEvictionPolicy;
        }

        public Boolean getOverflowToDisk() {
            return overflowToDisk;
        }

        public void setOverflowToDisk(Boolean overflowToDisk) {
            this.overflowToDisk = overflowToDisk;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getDiskStorePath() {
            return diskStorePath;
        }

        @Deprecated
        public void setDiskStorePath(String diskStorePath) {
            this.diskStorePath = diskStorePath;
        }

        public Boolean getEternal() {
            return eternal;
        }

        public void setEternal(Boolean eternal) {
            this.eternal = eternal;
        }

        public Long getTimeToLiveSeconds() {
            return timeToLiveSeconds;
        }

        public void setTimeToLiveSeconds(Long timeToLiveSeconds) {
            this.timeToLiveSeconds = timeToLiveSeconds;
        }

        public Long getTimeToIdleSeconds() {
            return timeToIdleSeconds;
        }

        public void setTimeToIdleSeconds(Long timeToIdleSeconds) {
            this.timeToIdleSeconds = timeToIdleSeconds;
        }

        public Boolean getDiskPersistent() {
            return diskPersistent;
        }

        public void setDiskPersistent(Boolean diskPersistent) {
            this.diskPersistent = diskPersistent;
        }

        public Long getDiskExpiryThreadIntervalSeconds() {
            return diskExpiryThreadIntervalSeconds;
        }

        public void setDiskExpiryThreadIntervalSeconds(
                Long diskExpiryThreadIntervalSeconds) {
            this.diskExpiryThreadIntervalSeconds = diskExpiryThreadIntervalSeconds;
        }

        public CacheEventListenerRegistry getEventListenerRegistry() {
            return eventListenerRegistry;
        }

        public void setEventListenerRegistry(
                CacheEventListenerRegistry eventListenerRegistry) {
            this.eventListenerRegistry = eventListenerRegistry;
        }

        public CacheLoaderRegistry getCacheLoaderRegistry() {
            return cacheLoaderRegistry;
        }

        public void setCacheLoaderRegistry(
                CacheLoaderRegistry cacheLoaderRegistry) {
            this.cacheLoaderRegistry = cacheLoaderRegistry;
        }

        public Boolean getObjectCache() {
            return objectCache;
        }

        public void setObjectCache(Boolean objectCache) {
            this.objectCache = objectCache;
        }
    }
}