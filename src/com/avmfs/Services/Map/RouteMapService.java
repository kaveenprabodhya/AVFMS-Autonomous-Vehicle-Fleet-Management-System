package com.avmfs.Services.Map;

import com.avmfs.Services.Model.Route;
import com.avmfs.Services.RouteService;

import java.util.Set;

public class RouteMapService extends AbstractMapService<Route, Long> implements RouteService {

    public RouteMapService() {
    }

    @Override
    public Set<Route> findAll() {
        return super.findAll();
    }

    @Override
    public Route findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Route save(Route object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Route object) {
        super.delete(object);
    }
}
