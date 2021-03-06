package org.jruby.util;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderGetResourses implements GetResources {

    private final ClassLoader loader;

    public ClassLoaderGetResourses(ClassLoader loader) {
        this.loader = loader;
    }

    @Override
    public URL getResource(String path) {
        return loader.getResource(path);
    }

    @Override
    public Enumeration<URL> getResources(String path) throws IOException {
        return loader.getResources(path);
    }
}
