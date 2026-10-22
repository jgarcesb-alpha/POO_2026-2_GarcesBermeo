# -*- coding: utf-8 -*-
"""
Created on Thu Oct 15 10:14:37 2026

@author: Garces
"""

import numpy as np
import tkinter as tk
from tkinter import messagebox
import matplotlib.pyplot as plt
import matplotlib
from mpl_toolkits.mplot3d.art3d import Poly3DCollection

matplotlib.use("TkAgg") #Linea de código necesaria al trabajar en Spyder

#Clase madre. Se inicializan los atributos de clase
class Solido:
    
    def __init__(self):
        self.areaSuperficial = 0
        self.volumenEncerrado = 0
  
#Primera clase hija
class Cilindro(Solido):
    
    def __init__(self, radioCm, alturaCm):
        
        #Se piden los datos del radio y de la altura en centimetros
        #Son atributos especificos de la clase
        
        super().__init__() #Se inicializan los atributos de la clase madre
        self.radio = radioCm
        self.altura = alturaCm
        
    def calcular(self):
        
        #En base al atributo especifico de la clase, se calcula el atributo
        #general volumenEncerrado. Su resultado está en Cm3
        self.volumenEncerrado = self.radio**2 * np.pi * self.altura
        
        #Similarmente, se calcula el area superficial del solido.
        self.areaSuperficial = 2*np.pi*self.radio**2 + 2*self.altura*np.pi*self.radio
        
    def mostrarGrafico(self):
        
        #Se utiliza la librería Matplotlib
        
        fig = plt.figure(figsize = (6,6))
        ax = fig.add_subplot(111, projection = "3d")
        
        theta = np.linspace(0, 2*np.pi, 1001)
        z = np.linspace(0, self.altura)
        Theta, Z = np.meshgrid(theta, z)
        
        X = self.radio * np.cos(Theta)
        Y= self.radio * np.sin(Theta)
        
        limite = self.radio * 1.5
        ax.set_xlim([-limite, limite])
        ax.set_ylim([-limite, limite])
        ax.set_zlim([-self.altura*0.2, self.altura * 1.2])
        
        ax.plot_surface(X,Y,Z, color="gold", alpha=0.8, edgecolor="gray")
        
        ax.set_xlabel("Eje X (cm)")
        ax.set_ylabel("Eje Y (cm)")
        ax.set_zlabel("Altura Z (cm)")
        ax.set_title(f"Cilindro 3D\nRadio:{self.radio} cm | Altura:{self.altura} cm")
        
        plt.show()
        

class Esfera(Solido):
    
    def __init__(self, radioCm):
        super().__init__()
        self.radio = radioCm
        
    def calcular(self):
        
        self.volumenEncerrado = (4/3)*np.pi*self.radio**3
        self.areaSuperficial = 4*np.pi*self.radio**2
        
    def mostrarGrafico(self):
        
        fig = plt.figure(figsize = (6,6))
        ax = fig.add_subplot(111, projection = "3d")
        
        r = self.radio
        phi = np.linspace(0, 2*np.pi, 1001)
        theta = np.linspace(0, np.pi, 1001)

        x = r*np.outer(np.cos(phi),np.sin(theta))
        y = r*np.outer(np.sin(phi), np.sin(theta))
        z = r*np.outer(np.ones(np.size(phi)),np.cos(theta))
        
        limite = r * 1.5
        ax.set_xlim([-limite, limite])
        ax.set_ylim([-limite, limite])
        ax.set_zlim([-r*1.2, r * 1.2])
        
        ax.plot_surface(x,y,z, color="maroon", alpha=0.8, edgecolor="gray")
        ax.set_xlabel("Eje X (cm)")
        ax.set_ylabel("Eje Y (cm)")
        ax.set_zlabel("Altura Z (cm)")
        ax.set_title(f"Esfera 3D\nRadio:{self.radio} cm")
        plt.show()
        
class Cubo(Solido):
    
    def __init__(self, ladoCm):
        super().__init__()
        self.lado = ladoCm
    
    def calcular(self):
        self.volumenEncerrado = self.lado**3
        self.areaSuperficial =6*self.lado**2
        
    def mostrarGrafico(self):
        
        fig = plt.figure(figsize=(6,6))
        ax = fig.add_subplot(111, projection = "3d")
        
        lado = self.lado
        
        ax.bar3d(0, 0, 0, lado, lado, lado, color="green", alpha=0.7, edgecolor="gray")

        ax.set_xlim([0, lado * 1.5])
        ax.set_ylim([0, lado * 1.5])
        ax.set_zlim([0, lado * 1.5])
        
        
        limite = lado * 1.5
        ax.set_xlim([-limite, limite])
        ax.set_ylim([-limite, limite])
        ax.set_zlim([-lado*0.2, lado * 1.2])
  
        ax.set_xlabel("Eje X (cm)")
        ax.set_ylabel("Eje Y (cm)")
        ax.set_zlabel("Eje Z (cm)")
        ax.set_title(f"Cubo 3D\nLado: {self.lado} cm")
  
        plt.show()
        
class Piramide(Solido):
    
    def __init__(self, lados, apotema, altura):
        super().__init__()
        self.nLados = int(lados)
        self.apotema = apotema
        self.altura = altura
        self.longLados = 2*apotema*np.tan(np.pi/self.nLados)
        self.perimetro = self.nLados*self.longLados
        
    def calcular(self):
        areaBase = self.perimetro*self.apotema*(1/2)
        self.volumenEncerrado = areaBase*self.altura*(1/3)
        
        alturaCaraLateral = np.sqrt(self.altura**2 + self.apotema**2)
        areaCaraLateral = (1/2)*self.longLados*alturaCaraLateral
        self.areaSuperficial = areaBase + self.nLados*areaCaraLateral
        
    def mostrarGrafico(self):
        fig = plt.figure(figsize=(6, 6))
        ax = fig.add_subplot(111, projection="3d")
    
        n = self.nLados
        s = self.longLados
        a_b = self.apotema
        h = self.altura
    
        # Radio al vértice de la base usando Pitágoras
        R = np.sqrt(a_b**2 + (s / 2) ** 2)
    
        # Generamos los vértices de la base en z = 0
        p_inf = []
        for k in range(n):
          angulo = 2 * np.pi * k / n
          x = R * np.cos(angulo)
          y = R * np.sin(angulo)
          p_inf.append((x, y, 0))
    
        # Cúspide de la pirámide en el centro (0, 0, h)
        apex = (0, 0, h)
    
        caras = []
        # La base inferior
        caras.append(p_inf)
    
        # Las caras laterales triangulares (conectando cada arista de la base con el ápice)
        for k in range(n):
          k_sig = (k + 1) % n
          cara_lateral = [p_inf[k], p_inf[k_sig], apex]
          caras.append(cara_lateral)
    
        piramide_poly = Poly3DCollection(
            caras, color="coral", alpha=0.7, edgecolor="gray"
        )
        ax.add_collection3d(piramide_poly)
    
        limite = R * 1.5
        ax.set_xlim([-limite, limite])
        ax.set_ylim([-limite, limite])
        ax.set_zlim([0, h * 1.2])
    
        ax.set_xlabel("Eje X (cm)")
        ax.set_ylabel("Eje Y (cm)")
        ax.set_zlabel("Altura Z (cm)")
        ax.set_title(
            f"Pirámide Regular de {n} Lados\nApotema Base: {a_b:.2f} cm | Altura:"
            f" {h:.2f} cm"
        )
    
        plt.show()
        
    
class Prisma(Solido):
    
    #Se calcula para un prisma regular
    
    def __init__(self, lados, apotema, altura):
        super().__init__()
        self.nLados = int(lados)
        self.apotema = apotema
        self.altura = altura
        self.longLados = 2*apotema*np.tan(np.pi/self.nLados)
        self.perimetro = self.nLados*self.longLados
        
    def calcular(self):
        perimetro = self.nLados*self.longLados
        areaBase = self.apotema*perimetro*(1/2)
        areaCaraLateral = self.longLados*self.altura

        self.volumenEncerrado = areaBase*self.altura
        self.areaSuperficial = 2*areaBase + self.nLados*areaCaraLateral  
        
    def mostrarGrafico(self):
      fig = plt.figure(figsize=(6, 6))
      ax = fig.add_subplot(111, projection="3d")
    
      n = self.nLados
      s = self.longLados
      a = self.apotema
      h = self.altura
    
      # Radio al vértice usando Pitágoras (apotema y mitad del lado)
      R = np.sqrt(a**2 + (s / 2) ** 2)
    
      # Generamos los vértices de la base inferior y superior
      p_inf = []
      p_sup = []
      for k in range(n):
        angulo = 2 * np.pi * k / n
        x = R * np.cos(angulo)
        y = R * np.sin(angulo)
        p_inf.append((x, y, 0))
        p_sup.append((x, y, h))
    
      caras = [p_inf, p_sup]
      for k in range(n):
        k_sig = (k + 1) % n
        caras.append([p_inf[k], p_inf[k_sig], p_sup[k_sig], p_sup[k]])
    
      prisma_poly = Poly3DCollection(
          caras, color="teal", alpha=0.7, edgecolor="gray"
      )
      ax.add_collection3d(prisma_poly)
    
      limite = R * 1.5
      ax.set_xlim([-limite, limite])
      ax.set_ylim([-limite, limite])
      ax.set_zlim([0, h * 1.2])
    
      ax.set_xlabel("Eje X (cm)")
      ax.set_ylabel("Eje Y (cm)")
      ax.set_zlabel("Altura Z (cm)")
      ax.set_title(f"Prisma Regular de {n} Lados\nApotema: {a:.2f} cm | Altura: {h:.2f} cm")
    
      plt.show()
        
#Clase que ejecuta la aplicación
class Aplicacion:
    def __init__(self, root):
        self.root = root
        self.root.title("Sólidos Geometricos")
        self.root.geometry("400x450")
        self.root.config(padx=20, pady=20)
        
        tk.Label(root, text="Seleccione el sólido geométrico a Calcular").pack(anchor="w")
        
        btnCilindro = tk.Button(root, text="Cilindro", command=self.ventanaCilindro)
        btnCilindro.pack(pady=15)
        
        btnEsfera = tk.Button(root, text="Esfera", command=self.ventanaEsfera)
        btnEsfera.pack(pady=15)
        
        btnCubo = tk.Button(root, text="Cubo", command=self.ventanaCubo)
        btnCubo.pack(pady=15)
        
        btnPiramide = tk.Button(root, text="Piramide", command=self.ventanaPiramide)
        btnPiramide.pack(pady=15)
        
        btnPrisma = tk.Button(root, text="Prisma", command=self.ventanaPrisma)
        btnPrisma.pack(pady=15)
        
    def ventanaCilindro(self):
        ventanaCilindro = tk.Toplevel(self.root)
        tk.Label(ventanaCilindro , text="Ingrese los datos del cilindro").pack(anchor="w")
        
        #Ingresando el radio
        tk.Label(ventanaCilindro , text = "Radio:").pack(anchor="w")
        self.radio = tk.Entry(ventanaCilindro, width = 25)
        self.radio.pack(pady=2)
        
        #Ingresando la altura
        tk.Label(ventanaCilindro, text = "Altura: ").pack(anchor="w")
        self.altura = tk.Entry(ventanaCilindro, width = 25)
        self.altura.pack(pady = 2)
        
        btnCalcular = tk.Button(ventanaCilindro, text = "Calcular", command = self.calcularCilindro)
        btnCalcular.pack(pady=15)
        
        btnCerrar = tk.Button(ventanaCilindro, text="Cerrar", command=ventanaCilindro.destroy)
        btnCerrar.pack(pady=15)
        
    def calcularCilindro(self):
        try:
            radioCm = float(self.radio.get())
            alturaCm = float(self.altura.get())
            
            miObjeto = Cilindro(radioCm, alturaCm)
            miObjeto.calcular()
            
            resultadoTexto = (f"Volumen: {miObjeto.volumenEncerrado:.2f} cm3\n"
                               f"Area Superficial: {miObjeto.areaSuperficial:.2f} cm2")
            
            messagebox.showinfo("Resultados", resultadoTexto)
            miObjeto.mostrarGrafico()
        except ValueError:
            messagebox.showerror("Error", "Ingrese por favor datos validos")
            
    def ventanaEsfera(self):
        ventanaEsfera = tk.Toplevel(self.root)
        tk.Label(ventanaEsfera, text="Ingrese los datos de la esfera").pack(anchor="w")
        
        tk.Label(ventanaEsfera, text="Radio:").pack(anchor="w")
        self.radio = tk.Entry(ventanaEsfera)
        self.radio.pack(pady=2)
        
        btnCalcular = tk.Button(ventanaEsfera, text="Calcular", command= self.calcularEsfera)
        btnCalcular.pack(pady=15)
        
        btnCerrar = tk.Button(ventanaEsfera, text="Cerrar", command=ventanaEsfera.destroy)
        btnCerrar.pack(pady=15)
        
    def calcularEsfera(self):
        try:
            radioCm = float(self.radio.get())
            
            miObjeto = Esfera(radioCm)
            miObjeto.calcular()
            
            resultadoTexto = (f"Volumen: {miObjeto.volumenEncerrado:.2f} cm3\n"
                              f"Area Superficial: {miObjeto.areaSuperficial:.2f} cm2")
            messagebox.showinfo("Resultados", resultadoTexto)
            miObjeto.mostrarGrafico()
        except ValueError:
            messagebox.showerror("Error", "Ingrese por favor datos validos")
            
    def ventanaCubo(self):
        ventanaCubo = tk.Toplevel(self.root)
        tk.Label(ventanaCubo, text="Cubo").pack(anchor="w")
        
        tk.Label(ventanaCubo, text="Lado:").pack(anchor="w")
        self.lado=tk.Entry(ventanaCubo)
        self.lado.pack(pady=2)
        
        btnCalcular = tk.Button(ventanaCubo, text="Calcular", command=self.calcularCubo)
        btnCalcular.pack(pady=15)
        
        btnCerrar = tk.Button(ventanaCubo, text="Cerrar", command=ventanaCubo.destroy)
        btnCerrar.pack(pady=15)
        
    def calcularCubo(self):
        try:
            lado=float(self.lado.get())
            miObjeto=Cubo(lado)
            miObjeto.calcular()
            
            resultadoTexto=(f"Volumen: {miObjeto.volumenEncerrado:.2f} cm3\n"
                            f"Area Superficial: {miObjeto.areaSuperficial:.2f} cm2")
            
            messagebox.showinfo("Resultados", resultadoTexto)
            miObjeto.mostrarGrafico()
        except ValueError:
            messagebox.showerror("Error", "Ingrese por favor datos validos")
            
    def ventanaPiramide(self):
        ventanaPiramide=tk.Toplevel(self.root)
        tk.Label(ventanaPiramide, text="Piramide").pack(anchor="w")
        
        tk.Label(ventanaPiramide, text="Apotema:").pack(anchor="w")
        self.apotema=tk.Entry(ventanaPiramide)
        self.apotema.pack(pady=15)
        
        tk.Label(ventanaPiramide, text="N° de Lados:").pack(anchor="w")
        self.nLados = tk.Entry(ventanaPiramide)
        self.nLados.pack(pady=15)
        
        tk.Label(ventanaPiramide, text="Altura:").pack(anchor="w")
        self.altura = tk.Entry(ventanaPiramide)
        self.altura.pack(pady=15)
        
        btnCalcular = tk.Button(ventanaPiramide, text="Calcular", command=self.calcularPiramide)
        btnCalcular.pack(pady=15)
        
        btnCerrar = tk.Button(ventanaPiramide, text="Cerrar", command=ventanaPiramide.destroy)
        btnCerrar.pack(pady=15)
        
    def calcularPiramide(self):
        try:
            apotema = float(self.apotema.get())
            nLados = int(self.nLados.get())
            altura = float(self.altura.get())
            
            if nLados < 3:
                raise ValueError()
            
            miObjeto = Piramide(nLados, apotema, altura)
            miObjeto.calcular()
            
            resultadoTexto = (f"Volumen: {miObjeto.volumenEncerrado:.2f} cm3\n"
                            f"Area Superficial: {miObjeto.areaSuperficial:.2f} cm2")
            
            messagebox.showinfo("Resultados", resultadoTexto)
            miObjeto.mostrarGrafico()
        except ValueError:
            messagebox.showerror("Error", "Ingrese por favor datos validos")
            
    def ventanaPrisma(self):
        ventanaPrisma=tk.Toplevel(self.root)
        tk.Label(ventanaPrisma, text="Prisma").pack(anchor="w")
        
        tk.Label(ventanaPrisma, text="Apotema:").pack(anchor="w")
        self.apotema=tk.Entry(ventanaPrisma)
        self.apotema.pack(pady=15)
        
        tk.Label(ventanaPrisma, text="N° de Lados:").pack(anchor="w")
        self.nLados = tk.Entry(ventanaPrisma)
        self.nLados.pack(pady=15)
        
        tk.Label(ventanaPrisma, text="Altura:").pack(anchor="w")
        self.altura = tk.Entry(ventanaPrisma)
        self.altura.pack(pady=15)
        
        btnCalcular = tk.Button(ventanaPrisma, text="Calcular", command=self.calcularPrisma)
        btnCalcular.pack(pady=15)
        
        btnCerrar = tk.Button(ventanaPrisma, text="Cerrar", command=ventanaPrisma.destroy)
        btnCerrar.pack(pady=15)
    
    def calcularPrisma(self):
        try:
            apotema = float(self.apotema.get())
            nLados = int(self.nLados.get())
            altura = float(self.altura.get())
            
            if nLados < 3:
                raise ValueError()
            
            miObjeto = Prisma(nLados, apotema, altura)
            miObjeto.calcular()
            
            resultadoTexto = (f"Volumen: {miObjeto.volumenEncerrado:.2f} cm3\n"
                            f"Area Superficial: {miObjeto.areaSuperficial:.2f} cm2")
            
            messagebox.showinfo("Resultados", resultadoTexto)
            miObjeto.mostrarGrafico()
        except ValueError:
            messagebox.showerror("Error", "Ingrese por favor datos validos")
            
if __name__ == "__main__":
    root = tk.Tk()
    app = Aplicacion(root)
    root.mainloop()