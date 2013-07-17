/*
 * This file is part of weld-se-scopes.
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.bpark.scope;

import org.jboss.weld.context.api.BeanStore;
import org.jboss.weld.context.beanstore.HashMapBeanStore;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

/**
 * @author Burt_Parkers
 */
public class CustomScopeExtension implements Extension {

    public static CustomContext CUSTOM_CONTEXT = null;

    public void afterBeanDiscovery(@Observes AfterBeanDiscovery event, BeanManager manager) {
        BeanStore beanStore = new HashMapBeanStore();
        final CustomContext customContext = new CustomContext();
        customContext.setBeanStore(beanStore);

        customContext.setActive(true);
        event.addContext(customContext);
        CUSTOM_CONTEXT = customContext;
    }
}
