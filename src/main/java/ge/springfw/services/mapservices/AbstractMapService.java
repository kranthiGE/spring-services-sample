package ge.springfw.services.mapservices;

import java.util.*;

import ge.springfw.domain.DomainObject;

/**
 * Created by kranthi on 15-Jul-16
 */
public abstract class AbstractMapService  {
    protected Map<Integer, DomainObject> domainMap;
    
    public AbstractMapService() {
        domainMap = new HashMap<>();
        loadDomainObjects();
    }

    public List<DomainObject> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Integer id) {
    		DomainObject domainObj = domainMap.get(id);
        return domainObj;
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null){

            if (domainObject.getId() == null){
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);

            return domainObject;
        } else {
            throw new RuntimeException("Object Can't be null");
        }
    }

    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey(){
        return Collections.max(domainMap.keySet()) + 1;
    }

    protected abstract void loadDomainObjects();

}
