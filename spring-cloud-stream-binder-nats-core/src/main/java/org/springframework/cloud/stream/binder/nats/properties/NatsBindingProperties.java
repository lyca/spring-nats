/*
 * Copyright 2016-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.binder.nats.properties;

import org.springframework.cloud.stream.binder.BinderSpecificPropertiesProvider;

/**
 * @author The NATS Authors
 */
public class NatsBindingProperties implements BinderSpecificPropertiesProvider {

	private NatsConsumerProperties consumer = new NatsConsumerProperties();

	private NatsProducerProperties producer = new NatsProducerProperties();

	public NatsConsumerProperties getConsumer() {
		return consumer;
	}

	public void setConsumer(NatsConsumerProperties consumer) {
		this.consumer = consumer;
	}

	public NatsProducerProperties getProducer() {
		return producer;
	}

	public void setProducer(NatsProducerProperties producer) {
		this.producer = producer;
	}

}