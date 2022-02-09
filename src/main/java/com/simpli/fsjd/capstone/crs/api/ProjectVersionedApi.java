package com.simpli.fsjd.capstone.crs.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.simpli.fsjd.capstone.crs.dto.ProjectDto;
import com.simpli.fsjd.capstone.crs.service.impl.ProjectServiceImpl;
import com.simpli.fsjd.capstone.crs.util.ApiPaths;

/**
 * Created by Md. Zohir Raihan
 */
@RestController
@RequestMapping("/versioning")
@Api(value = ApiPaths.ProjectCtrl.CTRL, description = "Project APIs")
@CrossOrigin
public class ProjectVersionedApi {

    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @GetMapping(value = "/{id}",params = "version=1")
    @ApiOperation(value = "Get By Id Operation V1", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV1(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @GetMapping(value = "/{id}", params = "version=2")
    @ApiOperation(value = "Get By Id Operation V2", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV2(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }
}
