package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.model.Model;

import java.util.LinkedList;
import java.util.List;

public class AbstractMockService<T extends Model>{

    protected List<T> modelList = new LinkedList<>();
}
