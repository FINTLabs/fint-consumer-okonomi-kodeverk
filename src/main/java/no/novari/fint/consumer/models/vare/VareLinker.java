package no.novari.fint.consumer.models.vare;

import no.novari.fint.model.resource.okonomi.kodeverk.VareResource;
import no.novari.fint.model.resource.okonomi.kodeverk.VareResources;
import no.novari.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class VareLinker extends FintLinker<VareResource> {

    public VareLinker() {
        super(VareResource.class);
    }

    public void mapLinks(VareResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public VareResources toResources(Collection<VareResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public VareResources toResources(Stream<VareResource> stream, int offset, int size, int totalItems) {
        VareResources resources = new VareResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(VareResource vare) {
        return getAllSelfHrefs(vare).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(VareResource vare) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(vare.getSystemId()) && !isEmpty(vare.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(vare.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(VareResource vare) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(vare.getSystemId()) && !isEmpty(vare.getSystemId().getIdentifikatorverdi())) {
            builder.add(vare.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

