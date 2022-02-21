/**
 *    Copyright [2022] Raymond Augé
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.rotty3000.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.osgi.service.cdi.annotations.Bean;
import org.osgi.service.cdi.annotations.Reference;
import org.osgi.service.cdi.annotations.Service;
import org.osgi.service.cdi.annotations.SingleComponent;
import org.osgi.service.log.Logger;

@Bean
@SingleComponent
@Service
public class App {

	private final Foo foo;
	private final Logger logger;

	@Inject
	public App(Logger logger, @Reference Foo foo) {
		this.logger = logger;
		this.foo = foo;
		this.logger.info("[constructor]");
	}

	public String app() {
		return foo.foo();
	}

	@PostConstruct
	void init() {
		logger.info("[post construct] " + foo.foo());
	}

	@PreDestroy
	void cleanup() {
		logger.info("[pre destroy] Goodbye cruel World!");
	}

}
