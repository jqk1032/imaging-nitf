/*
 * Copyright (c) Codice Foundation
 *
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 *
 */
package org.codice.imaging.nitf.core.tre;

/**
    Named list of entries within a TRE.
*/
class TreEntryListImpl extends TreGroupImpl implements TreEntryList {

    private String name;

    /**
        Constructor.

        @param tag the name of the entry list key
    */
    TreEntryListImpl(final String tag) {
        name = tag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return getName();
    }
}
