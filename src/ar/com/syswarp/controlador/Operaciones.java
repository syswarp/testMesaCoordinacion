/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
TODO: Ver en los lugares donde se pueda hacer un object generarl ej. Alta

 */
package ar.com.syswarp.controlador;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ar.com.syswarp.modelo.*;
import java.util.Date;
import org.hibernate.HibernateException;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class Operaciones {

    // Tipos de Usuario
    public void TipousuariosCreate(Tiposusuarios tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<Tiposusuarios> getTiposusuariosAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Tiposusuarios");
        List<Tiposusuarios> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<Tiposusuarios> getTiposusuariosPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Tiposusuarios where idtipousuario=" + id);
        List<Tiposusuarios> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public Tiposusuarios getTiposusuariosFindByPK(Integer id) {
        Tiposusuarios tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (Tiposusuarios) s.get(Tiposusuarios.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int TiposusuariosDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM Tiposusuarios tu WHERE tu.idtipousuario=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int TiposusuariosUPD(Integer idtipousuario, String tipousuario) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE Tiposusuarios tu SET tipousuario =:tipousuario WHERE tu.idtipousuario=:idtipousuario";
            Query query = s.createQuery(hql);
            query.setParameter("idtipousuario", idtipousuario);
            query.setParameter("tipousuario", tipousuario);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

// AGENCIAS
    // Tipos de Usuario
    public void AgenciasCreate(PrAgencias ag) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(ag);
        tx.commit();
        s.close();
    }

    public List<PrAgencias> getAgenciasAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrAgencias");
        List<PrAgencias> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrAgencias> getAgenciasPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrAgencias where idagencia=" + id);
        List<PrAgencias> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrAgencias getAgenciasFindByPK(Integer id) {
        PrAgencias tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrAgencias) s.get(PrAgencias.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int AgenciasDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrAgencias tu WHERE tu.idagencia=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int AgenciasUPD(Integer idagencia, String alias, String agencia, String cuit, Float latitud, Float longitud, String domicilio) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrAgencias tu SET alias =:alias, agencia =:agencia, cuit =:cuit, latitud =:latitud, longitud=:longitud, domicilio=:domicilio WHERE tu.idagencia=:idagencia";
            Query query = s.createQuery(hql);

            query.setParameter("idagencia", idagencia);
            query.setParameter("alias", alias);
            query.setParameter("agencia", agencia);
            query.setParameter("cuit", cuit);
            query.setParameter("latitud", latitud);
            query.setParameter("longitud", longitud);
            query.setParameter("domicilio", domicilio);

            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // buques
    public void BuquesCreate(PrBuques tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<PrBuques> getBuquesAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrBuques");
        List<PrBuques> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrBuques> getBuquesPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrBuques where idbuque=" + id);
        List<PrBuques> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrBuques getBuquesFindByPK(Integer id) {
        PrBuques tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrBuques) s.get(PrBuques.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int BuquesDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrBuques tu WHERE tu.idbuque=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int BuquesUPD(Integer idbuque, String imo, String nombre, String flag, BigDecimal grt, BigDecimal eslora, BigDecimal manga, BigDecimal puntal, BigDecimal coef, BigDecimal grtfac, BigDecimal coeffac) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrBuques tu SET imo=:imo, nombre=:nombre, flag=:flag, grt=:grt, eslora=:eslora, manga=:manga, puntal=:puntal, coef=:coef, grtfac=:grtfac, coeffac=:coeffac   WHERE tu.idbuque=:idbuque";
            Query query = s.createQuery(hql);

            query.setParameter("idbuque", idbuque);
            query.setParameter("imo", imo);
            query.setParameter("nombre", nombre);
            query.setParameter("flag", flag);
            query.setParameter("grt", grt);
            query.setParameter("eslora", eslora);
            query.setParameter("manga", manga);
            query.setParameter("puntal", puntal);
            query.setParameter("coef", coef);
            query.setParameter("grtfac", grtfac);
            query.setParameter("coeffac", coeffac);

            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // Empresas de Coordinacion  
    public void EmpresasCreate(PrEmpresasCoordinacion tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<PrEmpresasCoordinacion> getEmpresasAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrEmpresasCoordinacion");
        List<PrEmpresasCoordinacion> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrEmpresasCoordinacion> getEmpresasPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrEmpresasCoordinacion where idempresacoordinacion=" + id);
        List<PrEmpresasCoordinacion> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrEmpresasCoordinacion getEmpresasFindByPK(Integer id) {
        PrEmpresasCoordinacion tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrEmpresasCoordinacion) s.get(PrEmpresasCoordinacion.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int EmpresasDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrEmpresasCoordinacion tu WHERE tu.idempresacoordinacion=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int EmpresasUPD(Integer idempresacoordinacion, String empresa, String cuit, String domicilio) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrEmpresasCoordinacion tu SET empresa=:empresa, cuit=:cuit, domicilio=:domicilio  WHERE tu.idempresacoordinacion=:idempresacoordinacion";
            Query query = s.createQuery(hql);

            query.setParameter("empresa", empresa);
            query.setParameter("cuit", cuit);
            query.setParameter("domicilio", domicilio);
            query.setParameter("idempresacoordinacion", idempresacoordinacion);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // Practicos
    // Empresas de Coordinacion  
    public void PracticosCreate(PrPracticos tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<PrPracticos> getPracticosAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrPracticos");
        List<PrPracticos> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrPracticos> getPracticosPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrPracticos where idpractico=" + id);
        List<PrPracticos> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrPracticos getPracticosFindByPK(Integer id) {
        PrPracticos tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrPracticos) s.get(PrPracticos.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int PracticosDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrPracticos tu WHERE tu.idpractico=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int PracticosUPD(Integer idpractico, String practico, String habilitacion, String telefono, String celular, String otroTelefono, String direccion, Date FRevisacionMedica, Date FVencChalecoSalv) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrPracticos tu SET practico=:practico, habilitacion=:habilitacion, telefono=:telefono, celular=:celular, otroTelefono=:otroTelefono, direccion=:direccion, FRevisacionMedica=:FRevisacionMedica, FVencChalecoSalv=:FVencChalecoSalv  WHERE tu.idpractico=:idpractico";
            Query query = s.createQuery(hql);

            query.setParameter("idpractico", idpractico);
            query.setParameter("practico", practico);
            query.setParameter("habilitacion", habilitacion);
            query.setParameter("telefono", telefono);
            query.setParameter("celular", celular);
            query.setParameter("otroTelefono", otroTelefono);
            query.setParameter("direccion", direccion);
            query.setParameter("FRevisacionMedica", FRevisacionMedica);
            query.setParameter("FVencChalecoSalv", FVencChalecoSalv);

            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // PUERTOS
    public void PuertosCreate(PrPuertos tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<PrPuertos> getPuertosAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrPuertos");
        List<PrPuertos> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrPuertos> getPuertosPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrPuertos where idpuerto=" + id);
        List<PrPuertos> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrPuertos getPuertosFindByPK(Integer id) {
        PrPuertos tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrPuertos) s.get(PrPuertos.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int PuertosDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrPuertos tu WHERE tu.idpuerto=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int PuertosUPD(Integer idpuerto, String puerto, BigDecimal adicional, BigDecimal bonificacion, Integer interno, Double latitud, Double longitud, String domicilio) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrPuertos tu SET puerto=:puerto, adicional=:adicional, bonificacion=:bonificacion, interno=:interno, latitud=:latitud, longitud=:longitud, domicilio=:domicilio  WHERE tu.idpuerto=:idpuerto";
            Query query = s.createQuery(hql);
            query.setParameter("idpuerto", idpuerto);
            query.setParameter("puerto", puerto);
            query.setParameter("adicional", adicional);
            query.setParameter("bonificacion", bonificacion);
            query.setParameter("interno", interno);
            query.setParameter("latitud", latitud);
            query.setParameter("longitud", longitud);
            query.setParameter("domicilio", domicilio);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // MUELLES
    public void MuellesCreate(PrMuelles tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        PrPuertos p = new PrPuertos();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<PrMuelles> getMuellesAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrMuelles");
        List<PrMuelles> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<PrMuelles> getMuellesPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From PrMuelles where idmuelle=" + id);
        List<PrMuelles> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public PrMuelles getMuellesFindByPK(Integer id) {
        PrMuelles tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (PrMuelles) s.get(PrMuelles.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int MuellesDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM PrMuelles tu WHERE tu.idmuelle=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int MuellesUPD(Integer idmuelle, Integer idpuerto, String muelle, Long kilometro, String emax, Long rv, String estructura, BigDecimal det, Double latitud, Double longitud) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE PrMuelles tu SET idpuerto=:idpuerto, muelle=:muelle, kilometro=:kilometro, emax=:emax, rv=:rv, estructura=:estructura, det=:det, latitud=:latitud, longitud=:longitud   WHERE tu.idmuelle=:idmuelle";
            Query query = s.createQuery(hql);
            query.setParameter("idpuerto", idpuerto);
            query.setParameter("muelle", muelle);
            query.setParameter("kilometro", kilometro);
            query.setParameter("emax", emax);
            query.setParameter("rv", rv);
            query.setParameter("estructura", estructura);
            query.setParameter("det", det);
            query.setParameter("latitud", latitud);
            query.setParameter("longitud", longitud);
            query.setParameter("idmuelle", idmuelle);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    // USUARIOS
    public void UsuariosCreate(Usuarios tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Usuarios p = new Usuarios();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<Usuarios> getUsuariosAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Usuarios");
        List<Usuarios> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<Usuarios> getUsuariosPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Usuarios where idusuario=" + id);
        List<Usuarios> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public Usuarios getUsuariosFindByPK(Integer id) {
        Usuarios tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (Usuarios) s.get(Usuarios.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int UsuariosDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM Usuarios tu WHERE tu.idusuario=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    public int UsuariosUPD(int idusuario, String email, String clave, String nombre, String habilitado, int idtipousuario) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE Usuarios tu SET email=:email, clave=:clave, nombre=:nombre, habilitado=:habilitado, idtipousuario=:idtipousuario  WHERE tu.idusuario=:idusuario";
            Query query = s.createQuery(hql);
            query.setParameter("email", email);
            query.setParameter("clave", clave);
            query.setParameter("nombre", nombre);
            query.setParameter("habilitado", habilitado);
            query.setParameter("idtipousuario", idtipousuario);
            query.setParameter("idusuario", idusuario);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

// TIMESHIP
    public void TimeShipCreate(Timeship tu) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Timeship p = new Timeship();
        s.save(tu);
        tx.commit();
        s.close();
    }

    public List<Timeship> getTimeshipAll() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Timeship");
        List<Timeship> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public List<Timeship> getTimeshipPK(Integer id) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Query q = s.createQuery("From Timeship where idtimeship=" + id);
        List<Timeship> lista = q.list();
        tx.commit();
        s.close();
        return lista;
    }

    public Timeship getTimeshipFindByPK(Integer id) {
        Timeship tu;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        tu = (Timeship) s.get(Timeship.class, id);
        tx.commit();
        s.close();
        return tu;
    }

    public int TimeshipDel(Integer id) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        try {
            Transaction tx = s.beginTransaction();
            String hql = "DELETE FROM Timeship tu WHERE tu.idtimeship=:id";
            Query query = s.createQuery(hql);
            query.setParameter("id", id);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se borraron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }

    /* esto lo dejo de ejmplo porque seguro hay que segmentar y hacer pantallas
      public int TimeshipUPD( int idusuario, String email, String clave, String nombre, String habilitado , int idtipousuario) {
        Integer salida = -1;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();       
        try {
            Transaction tx = s.beginTransaction();
            String hql = "UPDATE Usuarios tu SET email=:email, clave=:clave, nombre=:nombre, habilitado=:habilitado, idtipousuario=:idtipousuario  WHERE tu.idusuario=:idusuario";
            Query query = s.createQuery(hql);            
            query.setParameter("email",email);
            query.setParameter("clave",clave);
            query.setParameter("nombre",nombre);
            query.setParameter("habilitado",habilitado);
            query.setParameter("idtipousuario",idtipousuario);
            query.setParameter("idusuario",idusuario);
            salida = query.executeUpdate();
            tx.commit();
            if (salida == 0) {
                System.out.println("No se actualizaron registros");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            return salida;
        }
    }
     */

    public String Encriptar(String texto) {

        String secretKey = "syswarp"; //llave para encriptar datos
        String base64EncryptedString = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }

    public String Desencriptar(String textoEncriptado) throws Exception {

        String secretKey = "syswarp"; //llave para desenciptar datos
        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }

}
