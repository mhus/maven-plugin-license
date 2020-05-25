package de.mhus.mvn.license;

import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "format", threadSafe = true,aggregator = true)
public class AggregatorLicenseFormatMojo extends LicenseFormatMojo {

}
