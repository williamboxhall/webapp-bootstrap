package org.example.application;

import org.springframework.stereotype.Repository;

import static com.google.common.collect.Lists.newArrayList;

@Repository
public class BakeryRepository {
    public Bakery get(int id) {
        // pretend like we went to a microservice
        return new Bakery("Ditsch", new Location("1 Happy St", "Lat:40.712784,Long:-74.005941"), newArrayList(1, 2, 3));
    }
}
