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

package com.github.bpark;

import com.github.bpark.scope.CustomScoped;

import javax.inject.Inject;

/**
 * @author Burt_Parkers
 */
public class ServiceLooper implements IServiceLooper {

    @Inject
    @CustomScoped
    MyService myService;

    public void callService() {
        myService.printStatus();
    }
}