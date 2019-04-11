/*
 * Copyright 2019. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ms.dew.devops.it.todo.notifier;

import ms.dew.devops.it.todo.common.TodoParentApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * To-do notifier application.
 *
 * @author gudaoxuri
 */
public class TodoNotifierApplication extends TodoParentApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(TodoNotifierApplication.class).run(args);
    }

}
