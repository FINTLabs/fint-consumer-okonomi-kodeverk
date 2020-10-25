package no.fint.consumer.config;

public enum Constants {
;

    public static final String COMPONENT = "okonomi-kodeverk";
    public static final String COMPONENT_CONSUMER = COMPONENT + " consumer";
    public static final String CACHE_SERVICE = "CACHE_SERVICE";

    
    public static final String CACHE_INITIALDELAY_MERVERDIAVGIFT = "${fint.consumer.cache.initialDelay.merverdiavgift:900000}";
    public static final String CACHE_FIXEDRATE_MERVERDIAVGIFT = "${fint.consumer.cache.fixedRate.merverdiavgift:900000}";
    
    public static final String CACHE_INITIALDELAY_VARE = "${fint.consumer.cache.initialDelay.vare:1000000}";
    public static final String CACHE_FIXEDRATE_VARE = "${fint.consumer.cache.fixedRate.vare:900000}";
    

}
