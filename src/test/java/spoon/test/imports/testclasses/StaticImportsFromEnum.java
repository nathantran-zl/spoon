/*
 * Copyright (C) 2006-2016 INRIA and contributors
 *  Spoon - http://spoon.gforge.inria.fr/
 *
 * This software is governed by the CeCILL-C License under French law and abiding by the rules of distribution of free software. You can use, modify and/or redistribute the software under the terms of the CeCILL-C license as circulated by CEA, CNRS and INRIA at http://www.cecill.info.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *
 * The fact that you are presently reading this means that you have had knowledge of the CeCILL-C license and that you accept its terms.
 */

package spoon.test.imports.testclasses;


/**
 * Created by urli on 16/12/2016.
 */
public class StaticImportsFromEnum {

    static enum DataElement {
        KEY("key"), VALUE("value");

        private final String description;

        private DataElement(final String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public DataElement[] getValues() {
        return DataElement.values();
    }

    public ItfWithEnum.Bar[] getBarValues() {
        return ItfWithEnum.Bar.values();
    }

    public ItfWithEnum.Bar getLip() {
        return ItfWithEnum.Bar.Lip;
    }
}
