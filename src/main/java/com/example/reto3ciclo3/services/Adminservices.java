package com.example.reto3ciclo3.services;

import com.example.reto3ciclo3.Modelo.Admin;
import com.example.reto3ciclo3.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class Adminservices {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return (List<Admin>)adminRepository.getAll();
    }

    public Optional<Admin> getAdmin(int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin admin){
        if (admin.getIdAdmin()==null){
            return  adminRepository.save(admin);
        } else {
            Optional<Admin> adminEncontrado = adminRepository.getAdmin(admin.getIdAdmin());
            if (adminEncontrado.isEmpty()){
                return adminRepository.save(admin);

            } else {
                return admin;
            }
        }
    }
    public  Admin update (Admin admin){
        if(admin.getIdAdmin() !=null){
            Optional<Admin> adminEncontrado =adminRepository.getAdmin(admin.getIdAdmin());
            if (!adminEncontrado.isEmpty()){
                if(admin.getPassword() != null) {
                    adminEncontrado.get().setPassword(admin.getPassword());
                }
                if (admin.getName() != null){
                    adminEncontrado.get().setName(admin.getName());


                }

                return adminRepository.save(adminEncontrado.get());

                }
            }
        return admin;

        }

        public boolean deleteAdmin(int adminId){
        boolean resultado= getAdmin(adminId).map(adminPorEliminar ->{
            adminRepository.delete(adminPorEliminar);
            return true;

        }).orElse(false);
        return resultado;
        }
    }

