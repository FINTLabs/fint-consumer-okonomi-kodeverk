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
            .put("no.novari.fint.model.administrasjon.kodeverk.Aktivitet", "/model/administrasjon/kodeverk/aktivitet")
            .put("no.novari.fint.model.administrasjon.kodeverk.Anlegg", "/model/administrasjon/kodeverk/anlegg")
            .put("no.novari.fint.model.administrasjon.kodeverk.Ansvar", "/model/administrasjon/kodeverk/ansvar")
            .put("no.novari.fint.model.administrasjon.kodeverk.Art", "/model/administrasjon/kodeverk/art")
            .put("no.novari.fint.model.administrasjon.kodeverk.Diverse", "/model/administrasjon/kodeverk/diverse")
            .put("no.novari.fint.model.administrasjon.kodeverk.Formal", "/model/administrasjon/kodeverk/formal")
            .put("no.novari.fint.model.administrasjon.kodeverk.Funksjon", "/model/administrasjon/kodeverk/funksjon")
            .put("no.novari.fint.model.administrasjon.kodeverk.Kontrakt", "/model/administrasjon/kodeverk/kontrakt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Lopenummer", "/model/administrasjon/kodeverk/lopenummer")
            .put("no.novari.fint.model.administrasjon.kodeverk.Objekt", "/model/administrasjon/kodeverk/objekt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Prosjekt", "/model/administrasjon/kodeverk/prosjekt")
            .put("no.novari.fint.model.administrasjon.kodeverk.Prosjektart", "/model/administrasjon/kodeverk/prosjektart")
            .put("no.novari.fint.model.administrasjon.kodeverk.Ramme", "/model/administrasjon/kodeverk/ramme")
            .put("no.novari.fint.model.okonomi.faktura.Fakturautsteder", "/model/okonomi/faktura/fakturautsteder")
            /* .put(TODO,TODO) */
            .build();
    }

}
