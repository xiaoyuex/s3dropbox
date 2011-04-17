/*
 * Copyright (c) 2009, Thomas Czarniecki
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  * Neither the name of S3DropBox, Thomas Czarniecki, tomczarniecki.com nor
 *    the names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.tomczarniecki.s3.rest;

import com.tomczarniecki.s3.ProgressListener;

import java.io.File;

public class WebRequest {

    private final Headers headers = new Headers();

    private final Method method;
    private final String url;

    private ProgressListener listener;
    private String contentType;
    private File file;

    public WebRequest(Method method, String url) {
        this.method = method;
        this.url = url;
    }

    public void setFile(File file, String contentType, ProgressListener listener) {
        this.contentType = contentType;
        this.listener = listener;
        this.file = file;
    }

    public void addHeaders(Headers headers) {
        this.headers.add(headers);
    }

    public void addHeader(String key, String value) {
        headers.add(key, value);
    }

    public Method getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public ProgressListener getListener() {
        return listener;
    }

    public String getContentType() {
        return contentType;
    }

    public File getFile() {
        return file;
    }


    public boolean hasFile() {
        return file != null;
    }

    public Headers getHeaders() {
        return headers;
    }
}