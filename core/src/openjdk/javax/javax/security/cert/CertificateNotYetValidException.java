/*
 * Copyright 1997-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */


package javax.security.cert;

/**
 * Certificate is not yet valid exception. This is thrown whenever
 * the current <code>Date</code> or the specified <code>Date</code>
 * is before the <code>notBefore</code> date/time in the Certificate
 * validity period.
 *
 * <p><em>Note: The classes in the package <code>javax.security.cert</code>
 * exist for compatibility with earlier versions of the
 * Java Secure Sockets Extension (JSSE). New applications should instead
 * use the standard Java SE certificate classes located in
 * <code>java.security.cert</code>.</em></p>
 *
 * @since 1.4
 * @author Hemma Prafullchandra
 * @version 1.14
 */
public class CertificateNotYetValidException extends CertificateException {

    /**
     * Constructs a CertificateNotYetValidException with no detail message. A
     * detail message is a String that describes this particular
     * exception.
     */
    public CertificateNotYetValidException() {
        super();
    }

    /**
     * Constructs a CertificateNotYetValidException with the specified detail
     * message. A detail message is a String that describes this
     * particular exception.
     *   
     * @param message the detail message.
     */
    public CertificateNotYetValidException(String message) {
        super(message);
    }
}
