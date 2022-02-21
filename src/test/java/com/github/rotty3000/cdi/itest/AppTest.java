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

package com.github.rotty3000.cdi.itest;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.rotty3000.cdi.App;
import com.github.rotty3000.cdi.Foo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

@ExtendWith({BundleContextExtension.class, ServiceExtension.class})
public class AppTest {

	@Test
	public void testApp(@InjectService App app) {
		assertThat(app).extracting(App::app).isEqualTo("The other thing...");
	}

	@Test
	public void testFoo(@InjectService Foo foo) {
		assertThat(foo).extracting(Foo::foo).isEqualTo("The other thing...");
	}

}
