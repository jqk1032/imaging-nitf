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
package org.codice.imaging.nitf.core;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codice.imaging.nitf.core.common.NitfFormatException;

/**
 * A NitfWriter implementation that works on streaming data.
 */
public class NitfOutputStreamWriter extends SharedNitfWriter {

    /**
     * Construct a stream-based NITF writer.
     *
     * @param nitfDataSource the source of data to be written out.
     * @param outputStream the output stream to write the data to.
     */
    public NitfOutputStreamWriter(final DataSource nitfDataSource, final OutputStream outputStream) {
        super(nitfDataSource);
        mOutput = new DataOutputStream(outputStream);
    }

    @Override
    public final void write() {
        try {
            writeData();
        } catch (NitfFormatException | IOException ex) {
            Logger.getLogger(NitfOutputStreamWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
