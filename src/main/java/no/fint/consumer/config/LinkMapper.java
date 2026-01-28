package no.fint.consumer.config;

import no.fint.consumer.utils.RestEndpoints;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import no.novari.fint.model.okonomi.kodeverk.Merverdiavgift;
import no.novari.fint.model.okonomi.kodeverk.Vare;

public class LinkMapper {

    public static Map<String, String> linkMapper(String contextPath) {
        return ImmutableMap.<String,String>builder()
            .put(Merverdiavgift.class.getName(), contextPath + RestEndpoints.MERVERDIAVGIFT)
            .put(Vare.class.getName(), contextPath + RestEndpoints.VARE)
            .put("no.novari.fint.model.administrasjon.kodeverk.Aktivitet", "/administrasjon/kodeverk/aktivitet")
            .put("no.novari.fint.model.administrasjon.kodeverk.Anlegg", "/administrasjon/kodeverk/anlegg")
            .put("no.novari.fint.model.administrasjon.kodeverk.Ansvar", "/administrasjon/kodeverk/ansvar")
            .put("no.novari.fint.model.administrasjon.kodeverk.Art", "/administrasjon/kodeverk/art")
            .put("no.novari.fint.model.administrasjon.kodeverk.Diverse", "/administrasjon/kodeverk/diverse")
            .put("no.novari.fint.model.administrasjon.kodeverk.Formal", "/administrasjon/kodeverk/formal")
            .put("no.novari.fint.model.administrasjon.kodeverk.Funksjon", "/administrasjon/kodeverk/funksjon")
            .put("no.novari.fint.model.administrasjon.kodeverk.Kontrakt", "/administrasjon/kodeverk/kontrakt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Lopenummer", "/administrasjon/kodeverk/lopenummer")
            .put("no.novari.fint.model.administrasjon.kodeverk.Objekt", "/administrasjon/kodeverk/objekt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Prosjekt", "/administrasjon/kodeverk/prosjekt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Prosjektart", "/administrasjon/kodeverk/prosjektart")
            .put("no.novari.fint.model.administrasjon.kodeverk.Ramme", "/administrasjon/kodeverk/ramme")
            .put("no.novari.fint.model.okonomi.faktura.Fakturautsteder", "/okonomi/faktura/fakturautsteder")
            /* .put(TODO,TODO) */
            .build();
    }

}
