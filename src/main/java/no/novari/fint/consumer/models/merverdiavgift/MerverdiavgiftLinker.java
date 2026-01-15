package no.novari.fint.consumer.models.merverdiavgift;

import no.novari.fint.model.resource.okonomi.kodeverk.MerverdiavgiftResource;
import no.novari.fint.model.resource.okonomi.kodeverk.MerverdiavgiftResources;
import no.novari.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class MerverdiavgiftLinker extends FintLinker<MerverdiavgiftResource> {

    public MerverdiavgiftLinker() {
        super(MerverdiavgiftResource.class);
    }

    public void mapLinks(MerverdiavgiftResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public MerverdiavgiftResources toResources(Collection<MerverdiavgiftResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public MerverdiavgiftResources toResources(Stream<MerverdiavgiftResource> stream, int offset, int size, int totalItems) {
        MerverdiavgiftResources resources = new MerverdiavgiftResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(MerverdiavgiftResource merverdiavgift) {
        return getAllSelfHrefs(merverdiavgift).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(MerverdiavgiftResource merverdiavgift) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(merverdiavgift.getSystemId()) && !isEmpty(merverdiavgift.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(merverdiavgift.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(MerverdiavgiftResource merverdiavgift) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(merverdiavgift.getSystemId()) && !isEmpty(merverdiavgift.getSystemId().getIdentifikatorverdi())) {
            builder.add(merverdiavgift.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

